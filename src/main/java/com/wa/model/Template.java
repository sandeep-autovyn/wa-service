package com.wa.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    public long templateId;
    public String templateName;
    public int paramCount;
    @OneToOne
    private Template childTemplate;

// number onboard xyz.com/v1/abc/mobilenumber
}
