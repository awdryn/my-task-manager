package br.com.awdryn.mytaskmanager.entity;

import lombok.Getter;

@Getter
public enum MemberType {
    Manager("Manager"),
    Coordinated("Coordinated"),
    TechnicalLeader("Technical Leader"),
    Engineer("Engineer"),
    QualityAssurance("Quality Assurance"),
    DataAdministrator("Data Administrator"),
    ProductOwner("Product Owner"),
    SystemsAnalyst("Systems Analyst"),
    ScrumMaster("Scrum Master");

    private String memberDesc;

    MemberType(String memberDesc) {
        this.memberDesc = memberDesc;
    }
}
