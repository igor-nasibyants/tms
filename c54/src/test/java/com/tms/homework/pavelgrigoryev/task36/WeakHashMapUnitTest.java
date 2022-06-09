package com.tms.homework.pavelgrigoryev.task36;

import org.junit.jupiter.api.Test;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import static com.jayway.awaitility.Awaitility.await;
import static org.junit.jupiter.api.Assertions.*;

public class WeakHashMapUnitTest {
    @Test
    public void givenWeakHaspMap_whenCacheValueThatHasNoReferenceToIt_GCShouldReclaimThatObject() {
        WeakHashMap<UniqueImageName, BigImage> weakHashMap = new WeakHashMap<>();
        BigImage bigImage = new BigImage("image_id");
        UniqueImageName uniqueImageName = new UniqueImageName("name_of_big_image");

        weakHashMap.put(uniqueImageName, bigImage);
        assertTrue(weakHashMap.containsKey(uniqueImageName));

        uniqueImageName = null;
        System.gc();

        await().atMost(10, TimeUnit.SECONDS).until(weakHashMap::isEmpty);
    }

    @Test
    public void givenWeakHashMap_whenCacheValueThatHasNoReferenceToIt_GCShouldReclaimThatObjectButLeaveReferencedObject() {
        WeakHashMap<UniqueImageName, BigImage> weakHashMap = new WeakHashMap<>();
        BigImage bigImageFirst = new BigImage("foo");
        UniqueImageName uniqueImageNameFirst = new UniqueImageName("name_of_big_image");

        BigImage bigImageSecond = new BigImage("foo_2");
        UniqueImageName uniqueImageNameSecond = new UniqueImageName("name_of_big_image_2");

        weakHashMap.put(uniqueImageNameFirst, bigImageFirst);
        weakHashMap.put(uniqueImageNameSecond, bigImageSecond);
        assertTrue(weakHashMap.containsKey(uniqueImageNameFirst));
        assertTrue(weakHashMap.containsKey(uniqueImageNameSecond));

        uniqueImageNameFirst = null;
        System.gc();

        await().atMost(10, TimeUnit.SECONDS).until(() -> weakHashMap.size() == 1);
        await().atMost(10, TimeUnit.SECONDS).until(() -> weakHashMap.containsKey(uniqueImageNameSecond));
    }
}
