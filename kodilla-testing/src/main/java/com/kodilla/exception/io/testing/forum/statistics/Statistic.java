package com.kodilla.exception.io.testing.forum.statistics;

import java.util.List;

public interface Statistic {
    List<String> userNames();
    int postCount();
    int commentsCount();
}
