package com.downtime.dtos;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Resource {
    private String id;
    private String resourceName;
    private String resourceCode;
    private String description;
    private String note;
    private ResourceTypeEnum type;
    private String location;
    private String orgKey;
    private boolean isAvailable;
    private Long createAt;
}
