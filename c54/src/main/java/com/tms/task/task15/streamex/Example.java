package com.tms.task.task15.streamex;

import one.util.streamex.EntryStream;
import one.util.streamex.IntStreamEx;
import one.util.streamex.StreamEx;
import org.w3c.dom.NodeList;

import javax.lang.model.element.Element;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.*;

public class Example {
    private static final Role user = new Role("user", Boolean.TRUE);
    private static final Role admin = new Role("admin", Boolean.TRUE);
    private static final List<User> users = Arrays.asList(new User(admin, "Igor"), new User(user, "Andrew"));
    private static final Map<String, Role> nameToRole = new HashMap<>(){{
        put("Igor", admin);
        put("Andrew", admin);
    }};

    public static void main(String[] args) {

        List<String> userNames = StreamEx.of(users).map(User::getName).toList();
        Map<Role, List<User>> role2users = StreamEx.of(users).groupingBy(User::getRole);
        StreamEx.of(1,2,3).joining("; "); // "1; 2; 3"
    }

    public List<Element> elementsOf(NodeList nodeList) {
        return IntStreamEx.range(nodeList.getLength())
                .mapToObj(nodeList::item).select(Element.class).toList();
    }

    public List<String> getDropDownOptions() {
        return StreamEx.of(users).map(User::getName).prepend("(none)").toList();
    }

    public int[] addValue(int[] arr, int value) {
        return IntStreamEx.of(arr).append(value).toArray();
    }

    public void copyNonEmptyLines(Reader reader, Writer writer) throws IOException {
        for(String line : StreamEx.ofLines(reader).remove(String::isEmpty)) {
            writer.write(line);
            writer.write(System.lineSeparator());
        }
    }

    public Set<String> getEnabledRoleNames() {
        return StreamEx.ofKeys(nameToRole, Role::isEnabled).toSet();
    }

    public Map<String, List<String>> invert(Map<String, List<String>> map) {
        return EntryStream.of(map).flatMapValues(List::stream).invert().grouping();
    }

    public Map<String, String> stringMap(Map<Object, Object> map) {
        return EntryStream.of(map).mapKeys(String::valueOf)
                .mapValues(String::valueOf).toMap();
    }

    Map<String, Group> nameToGroup;

    public Map<String, List<User>> getGroupMembers(Collection<String> groupNames) {
        return StreamEx.of(groupNames).mapToEntry(nameToGroup::get)
                .nonNullValues().mapValues(Group::getMembers).toMap();
    }
}
