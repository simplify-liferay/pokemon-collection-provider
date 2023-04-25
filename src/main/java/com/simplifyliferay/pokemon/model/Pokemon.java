package com.simplifyliferay.pokemon.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.model.ClassedModel;

import java.io.Serializable;

public class Pokemon implements ClassedModel {

    private long id;
    private String name;
    private String description;
    private float height;
    private float weight;
    private int generation;
    private String imageUrl;
    private String[] types;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String[] getTypes() {
        return types;
    }

    public void setTypes(String[] types) {
        this.types = types;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Class<?> getModelClass() {
        return Pokemon.class;
    }

    @Override
    public String getModelClassName() {
        return Pokemon.class.getName();
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setId(Long.parseLong(primaryKeyObj.toString()));
    }
}
