package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {

    abstract TimeEntry create(TimeEntry timeEntry);

    abstract TimeEntry find(Long id);

    abstract List<TimeEntry> list();

    abstract TimeEntry update(Long id, TimeEntry  timeEntry);

    abstract void delete(Long id);
}
