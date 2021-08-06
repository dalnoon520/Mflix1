package model;

import lombok.Data;

@Data
public class Tomatoes {
    private Data lasUpdated;
    private String production;
    private String consensus;
    private int fresh;
    private int rotten;
    private Critic critic;
    private Viewer viewer;
}
