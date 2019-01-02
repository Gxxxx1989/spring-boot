package com.guoxi.module.dao;

public class BidInfo {
    private Integer id;

    private String targetProject;

    private String bidSection;

    private String region;

    private String tenderingUnit;

    private Double offer;

    private Double cost;

    private String bidEvaluationMethod;

    private String competitiveness;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTargetProject() {
        return targetProject;
    }

    public void setTargetProject(String targetProject) {
        this.targetProject = targetProject == null ? null : targetProject.trim();
    }

    public String getBidSection() {
        return bidSection;
    }

    public void setBidSection(String bidSection) {
        this.bidSection = bidSection == null ? null : bidSection.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getTenderingUnit() {
        return tenderingUnit;
    }

    public void setTenderingUnit(String tenderingUnit) {
        this.tenderingUnit = tenderingUnit;
    }

    public Double getOffer() {
        return offer;
    }

    public void setOffer(Double offer) {
        this.offer = offer;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getBidEvaluationMethod() {
        return bidEvaluationMethod;
    }

    public void setBidEvaluationMethod(String bidEvaluationMethod) {
        this.bidEvaluationMethod = bidEvaluationMethod == null ? null : bidEvaluationMethod.trim();
    }

    public String getCompetitiveness() {
        return competitiveness;
    }

    public void setCompetitiveness(String competitiveness) {
        this.competitiveness = competitiveness == null ? null : competitiveness.trim();
    }
}