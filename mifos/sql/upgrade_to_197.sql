ALTER TABLE LOAN_AMOUNT_FROM_LOAN_CYCLE MODIFY COLUMN RANGE_INDEX SMALLINT NOT NULL;

CREATE TABLE GROUP_LOAN_COUNTER(
 GROUP_LOAN_COUNTER_ID INTEGER auto_increment NOT NULL,
 GROUP_PERF_ID INTEGER NOT NULL,
 LOAN_OFFERING_ID SMALLINT NOT NULL,
 LOAN_CYCLE_COUNTER SMALLINT,
 PRIMARY KEY(GROUP_LOAN_COUNTER_ID)
)
ENGINE=InnoDB CHARACTER SET utf8;

UPDATE DATABASE_VERSION SET DATABASE_VERSION=197 WHERE DATABASE_VERSION=196;