package org.apache.commons.lang3;

public enum Validation {
    NULL("37a6259cc0c1dae299a7866489dff0bd"),
    EMPTY("a2e4822a98337283e39f7b60acf85ec9"),
    TOO_SHORT("b8646db1a4e48e343021c703233ba45c"),
    TOO_LONG("7900eea4c53fb2d1db1dc2ffa23b3daf"),
    VALID("10674249aecfb5efa426a9de310981cc"),
    INVALID("fedb2d84cafe20862cb4399751a8a7e3");

    private final String hash;

    Validation(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return this.hash;
    }
}
