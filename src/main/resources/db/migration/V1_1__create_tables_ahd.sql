create table requestsTypes
(
    id               bigserial primary key not null,
    requestsTypeName varchar(80)           not null
);

-- create table Structure
-- (
--     id            bigserial primary key not null,
--     structureName varchar(250)          not null
-- );

create table requestStatus
(
    id         bigserial primary key not null,
    statusName varchar(250)          not null
);

create table Requests
(
    id                      bigserial primary key                not null,
    requestNumber           varchar(50)                          not null,
    requestType             bigint references requestsTypes (id) not null,
    responsiblePerson       bigint references Employees (id)     not null,
    employeeId              bigint references Employees (id)     not null,
    doingDepartmentName     bigint references workersDepartments (id) ,
    requestContent          varchar(1000)                        not null,
    requestRegistrationDate timestamp                            not null,
    requestIsAccepted       boolean,
    requestIsDeny           boolean,
    requestIsReady          boolean,
    requestStatus           bigint references requestStatus (id) not null
);

-- create table responsiblePersons
-- (
--     id                           bigserial primary key            not null,
--     responsiblePersonName        varchar(50)                      not null,
--     responsiblePersonPhoneNumber varchar(50)                      not null,
--     responsiblePersonEmail       varchar(50)                      not null,
--     responsiblePersonStructureId bigint references Structure (id) not null,
--     responsiblePersonRequest     bigint references Requests (id)  not null
--
-- );

create table Employees
(
    id                  bigserial primary key                     not null,
    employeeName        varchar(50)                               not null,
    employeePhoneNumber varchar(50)                               not null,
    employeeEmail       varchar(50)                               not null,
    departmentId        bigint references workersDepartments (id) not null
);

create table workersDepartments
(
    id             bigserial primary key not null,
    departmentName varchar(50)           not null
);
