package org.superpaulscompany.pavel.model;

import java.io.Serializable;

public record Application(String name, String nickName, String age, String wish) implements Serializable {
}
