package com.jk.pojo.type;

import java.io.Serializable;

/**
 * Created by Lynn-F_X on 2017/5/25.
 */
public class MovieType implements Serializable{
    private int typeID;

    private String typeName;

    private String typeLink;

    public String getTypeLink() {
        return typeLink;
    }

    public void setTypeLink(String typeLink) {
        this.typeLink = typeLink;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
