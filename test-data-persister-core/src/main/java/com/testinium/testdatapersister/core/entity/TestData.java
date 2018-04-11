package com.testinium.testdatapersister.core.entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author erdoganonur on 11.04.2018
 */
@Document
public class TestData {

    private String key;
    private String value;
    private String scope;
    private String container;

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getScope() {
        return this.scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getContainer() {
        return this.container;
    }

    public void setContainer(String container) {
        this.container = container;
    }
}
