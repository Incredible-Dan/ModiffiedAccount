//package com.Turtle;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class TurtleTest {
////Turtle turtle;
//Pen turtlePen;
//    @org.junit.jupiter.api.BeforeEach
//    void setUp() {
//
//
//
//    }
//
//    @org.junit.jupiter.api.AfterEach
//    void tearDown() {
//        turtlePen = new Pen();
//        turtle = new Turtle(turtlePen);
//
//    }
//    @Test
//    void turtle_hasAPen(){
//        assertNotNull(turtle.getPen());
//
//    }
//
//    @Test
//    void turtlePen_CanBeSetToDown(){
//        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
//        System.out.println(turtle.getPen().getPenOrientation());
//        assertEquals(turtle.getPen().getPenOrientation(),PenOrientation.PEN_UP);
//    }
//    @Test
//    void setTurtlePen_canBeSetToUp(){
//        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
//    }
//}