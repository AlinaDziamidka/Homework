package com.itacademy.brest.Test.class13;

import java.util.ArrayList;
import java.util.List;

public abstract class SomeTree {
//    private List<Leaf> leafs;
//    private TreeType type;
//    private String name;
//
//    abstract TreeType getType();
//
//    public SomeTree(TreeType type, String name, Integer leafNumber, Season season) {
//        this.type = type;
//        this.name = name;
//        leafs = new ArrayList<>();
//        setLeaves(leafNumber, season);
//    }
//
//    @Override
//    public String toString() {
//        return "SomeTree{" +
//                "leafs=" + leafs +
//                ", type=" + type +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    public void setLeaves(Integer leafNumber, Season season) {
//        if (season != Season.WINTER) {
//            for (int i = 0; i < leafNumber; i++) {
//                switch (season) {
//                    case AUTUMN -> leafs.add(new Leaf("yellow"));
//                    case SPRING -> leafs.add(new Leaf("light green"));
//                    case SUMMER -> leafs.add(new Leaf("green"));
//                }
//            }
//        }
//    }
//
//    public List<Leaf> getLeafs() {
//        return leafs;
//    }
//
//    public void setLeafs(List<Leaf> leafs) {
//        this.leafs = leafs;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setType(TreeType type) {
//        this.type = type;
//    }
//    public class Leaf {
//
//        private String colour;
//
//        public Leaf(String colour) {
//            this.colour = colour;
//        }
//
//        public String getColour() {
//            return colour;
//        }
//
//        public void setColour(String colour) {
//            this.colour = colour;
//        }
//
//        @Override
//        public String toString() {
//            return "Leaf{" +
//                    "colour='" + colour + '\'' +
//                    '}';
//        }
//    }
}
