package com.annotations.jsonfields;
class DataModel {

    @JsonField(name = "emp_name")
    private String name;

    @JsonField(name = "emp_id")
    private int id;

    private String secret;   // not serialized

    public DataModel(String name, int id, String secret) {
        this.name = name;
        this.id = id;
        this.secret = secret;
    }
}