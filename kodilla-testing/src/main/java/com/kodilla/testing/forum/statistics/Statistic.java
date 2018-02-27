package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistic {
    List<String> userNames();
    int postCount();
    int commentsCount();
}
