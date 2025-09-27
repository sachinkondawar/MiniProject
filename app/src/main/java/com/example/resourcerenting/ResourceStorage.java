package com.example.resourcerenting;

import java.util.ArrayList;
import java.util.List;

public class ResourceStorage {
    private static final List<Resource> resourceList = new ArrayList<>();

    public static void addResource(Resource resource) {
        resourceList.add(resource);
    }

    public static List<Resource> getResources() {
        return resourceList;
    }
}
