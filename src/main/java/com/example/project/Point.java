package com.example.project;

public class Point {
    private int x;
    private int y;
    
    public Point(int x, int y) {
      this.x = x;
      this.y = y;
    }
    
    // Returns distance between this Point object and another Point object
    public double distanceTo(Point other) {
      int xDist = Math.abs(x - other.getX());
      int yDist = Math.abs(y - other.getY());
      return Math.sqrt((double) Math.pow(xDist, 2) + (double) Math.pow(yDist, 2));
    }
  
    // Returns a string in the format: (x, y)
    public String pointInfo() {
      return "(" + x + ", " + y + ")";
    }
    public int getX() {
      return x;
    }
    public int getY() {
      return y;
    }
    public void setX(int newX) {
      x = newX;
    }
    public void setY(int newY) {
      y = newY;
    }
  }
  