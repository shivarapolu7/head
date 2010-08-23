/*
 * Copyright (c) 2005-2010 Grameen Foundation USA
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 *
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an
 * explanation of the license and how it is applied.
 */

package org.mifos.framework.components.batchjobs.persistence;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mifos.framework.MifosIntegrationTestCase;

import org.mifos.framework.exceptions.PersistenceException;

public class TaskPersistenceIntegrationTest extends MifosIntegrationTestCase {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testHasLoanArrearsTaskRunSuccessfully() throws PersistenceException {
        /* TODO QUARTZ
        Task task1 = new Task();
        task1.setDescription(SchedulerConstants.FINISHED_SUCCESSFULLY);
        task1.setStartTime(new Timestamp(System.currentTimeMillis()));
        task1.setEndTime(new Timestamp(System.currentTimeMillis()));
        task1.setStatus(TaskStatus.COMPLETE.getValue());
        task1.setTask("LoanArrearsTask");

        TaskPersistence p = new TaskPersistence();
        p.saveAndCommitTask(task1);

        StaticHibernateUtil.closeSession();
        p = new TaskPersistence();
       Assert.assertTrue(p.hasLoanArrearsTaskRunSuccessfully());
        Task task2 = new Task();
        task2.setDescription(SchedulerConstants.FINISHED_SUCCESSFULLY);
        task2.setStartTime(new Timestamp(System.currentTimeMillis()));
        task2.setEndTime(new Timestamp(System.currentTimeMillis()));
        task2.setStatus(TaskStatus.INCOMPLETE.getValue());
        task2.setTask("LoanArrearsTask");
        new TaskPersistence().saveAndCommitTask(task2);

        StaticHibernateUtil.closeSession();
        Assert.assertFalse(p.hasLoanArrearsTaskRunSuccessfully());
        TestObjectFactory.removeObject(task1);
        TestObjectFactory.removeObject(task2);*/
    }

    @Test
    public void testSaveAndCommit() throws PersistenceException {
        /* TODO QUARTZ
        Task task = new Task();
        task.setDescription(SchedulerConstants.FINISHED_SUCCESSFULLY);
        task.setStartTime(new Timestamp(System.currentTimeMillis()));
        task.setEndTime(new Timestamp(System.currentTimeMillis()));
        task.setStatus(TaskStatus.COMPLETE.getValue());
        task.setTask("ProductStatus");
        new TaskPersistence().saveAndCommitTask(task);
        StaticHibernateUtil.closeSession();
        Query query = StaticHibernateUtil.getSessionTL().createQuery("from " + Task.class.getName());
        List<Task> tasks = query.list();
        Assert.assertNotNull(tasks);
       Assert.assertEquals(1, tasks.size());
        for (Task task1 : tasks) {
           Assert.assertEquals(TaskStatus.COMPLETE.getValue().shortValue(), task1.getStatus());
           Assert.assertEquals("ProductStatus", task1.getTask());
           Assert.assertEquals(SchedulerConstants.FINISHED_SUCCESSFULLY, task1.getDescription());
            TestObjectFactory.removeObject(task1);
        }*/
    }

    @Test
    public void testSaveAndCommitForInvalidConnection() {
        /* TODO QUARTZ
        Task task = new Task();
        task.setId(1);
        task.setDescription(SchedulerConstants.FINISHED_SUCCESSFULLY);
        task.setStartTime(new Timestamp(System.currentTimeMillis()));
        task.setEndTime(new Timestamp(System.currentTimeMillis()));
        task.setStatus(TaskStatus.COMPLETE.getValue());
        task.setTask("ProductStatus");
        try {
            new TaskPersistence().saveAndCommitTask(task);
            Assert.fail();
        } catch (PersistenceException e) {
           Assert.assertTrue(true);
        }
        StaticHibernateUtil.closeSession();

        Query query = StaticHibernateUtil.getSessionTL().createQuery("from " + Task.class.getName());
        List<Task> tasks = query.list();
        Assert.assertNotNull(tasks);
       Assert.assertEquals(0, tasks.size());*/
    }

}
