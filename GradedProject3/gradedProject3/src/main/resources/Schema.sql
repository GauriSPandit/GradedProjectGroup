CREATE TABLE role (
    roleId int NOT NULL AUTO_INCREMENT ,
    roleName varchar(255),
    PRIMARY KEY (roleId)
);

CREATE TABLE employee (
    employeeId int NOT NULL AUTO_INCREMENT ,
    firstName varchar(255),
    lastName varchar(255),
    email varchar(255),
    PRIMARY KEY (employeeId)
);



