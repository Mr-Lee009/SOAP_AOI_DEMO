package com.edu.mta.service;

import java.util.Date;

public interface HumanResourceService {
    void bookLeave(Date startDate, Date endDate, String name);
}
