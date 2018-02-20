package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticTestSuite {
    @Test
    public void testCalculateStatisticNoPost() {
        //Given
        Statistic statisticMock = mock(Statistic.class);
        List<String> lists = new ArrayList<>();
        lists.add("Marta Rembelska");
        when(statisticMock.userNames()).thenReturn(lists);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postCount()).thenReturn(0);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());

        //Then
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerPost);
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerUser);
        Assert.assertEquals(0, calculateStatistic.averagePostPerUser);
    }

    @Test
    public void testCalculateStatistic1000post() {
        System.out.println("Assumption: Number of posts = 1000");
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for (int i = 1; i <= 35; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.postCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(2500);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());;

        //Then
        Assert.assertEquals(35, calculateStatistic.averageCommentsPerPost, 0);
        Assert.assertEquals(1000, calculateStatistic.averageCommentsPerUser, 0);
        Assert.assertEquals(2500,calculateStatistic.averagePostPerUser, 0);

    }

    @Test
    public void testCalculateStatistic0Comments() {
        System.out.println("Assumption: Number of comments = 0");
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for (int i = 1; i <= 35; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(0);
        when(statisticMock.postCount()).thenReturn(0);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());;

        //Then
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerPost, 0);
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerUser, 0);
        Assert.assertEquals(0,calculateStatistic.averagePostPerUser, 0);

    }

    @Test
    public void testCalculateStatisticMorePostThanCom() {
        System.out.println("Assumption: Number of posts is more than comments");
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for (int i = 1; i <= 35; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.postCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(250);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());;

        //Then
        Assert.assertEquals(35, calculateStatistic.averageCommentsPerPost, 0);
        Assert.assertEquals(1000, calculateStatistic.averageCommentsPerUser, 0);
        Assert.assertEquals(250,calculateStatistic.averagePostPerUser, 0);

    }

    @Test
    public void testCalculateStatisticMoreComThanPost() {
        System.out.println("Assumption: Number of posts is less than comments");
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for (int i = 1; i <= 35; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.postCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(2500);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());;

        //Then
        Assert.assertEquals(35, calculateStatistic.averageCommentsPerPost, 0);
        Assert.assertEquals(1000, calculateStatistic.averageCommentsPerUser, 0);
        Assert.assertEquals(2500,calculateStatistic.averagePostPerUser, 0);

    }

    @Test
    public void testCalculateStatistic0Users() {
        System.out.println("Assumption: Number of users = 0");
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for (int i = 1; i <= 35; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.postCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(2500);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());;

        //Then
        Assert.assertEquals(0, calculateStatistic.averageCommentsPerPost, 0);
        Assert.assertEquals(1000, calculateStatistic.averageCommentsPerUser, 0);
        Assert.assertEquals(2500,calculateStatistic.averagePostPerUser, 0);

    }
    @Test
    public void testCalculateStatistic100Users() {
        System.out.println("Assumption: Number of users = 1000");
        //Given
        Statistic statisticMock = mock(Statistic.class);
        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for (int i = 1; i <= 35; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.postCount()).thenReturn(1000);
        when(statisticMock.commentsCount()).thenReturn(2500);

        //When
        CalculateStatistic calculateStatistic = new CalculateStatistic();
        calculateStatistic.calculateAdvStatiscics(statisticMock);
        //System.out.println(calculateStatistic.showStatistic());;

        //Then
        Assert.assertEquals(100, calculateStatistic.averageCommentsPerPost, 0);
        Assert.assertEquals(1000, calculateStatistic.averageCommentsPerUser, 0);
        Assert.assertEquals(2500,calculateStatistic.averagePostPerUser, 0);

    }

}
