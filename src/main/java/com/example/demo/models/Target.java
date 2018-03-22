package com.example.demo.models;

public class Target {
    private String name;
    private String mitlist;
    private String description;
    private String vulnerabilities;
    private String ipaddr;
    private Boolean isDed;
    private Boolean isInactive;
    private Boolean isServer;
    private Boolean isPC;
    private Boolean isFirewall;
    private Integer ttl;

    private String playerName;
    private String machineName;
    private String data;

    private String protectIP;
    private String protectID;
    private FirewallLevels level;

    public Target() {
    }

    public Target(String name, String mitlist, String description, String vulnerabilities) {
        this.name = name;
        this.mitlist = mitlist;
        this.description = description;
        this.vulnerabilities = vulnerabilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMitlist() {
        return mitlist;
    }

    public void setMitlist(String mitlist) {
        this.mitlist = mitlist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(String vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", mitlist='" + mitlist + '\'' +
                ", description='" + description + '\'' +
                ", vulnerabilities='" + vulnerabilities + '\'' +
                '}';
    }
}
