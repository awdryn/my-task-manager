package br.com.awdryn.mytaskmanager.entity;

import lombok.Getter;

@Getter
public enum State {
    NEW("New"),
    TODO("ToDo"),
    COMPLETE("Complete"),
    PENDING("Pending"),
    ARCHIVED("Archived");

    private String statusDesc;

    State(String statusDesc) {
        this.statusDesc = statusDesc;
    }
}
