create database Hotel;

CREATE TABLE Employees(
EmployeeID int not null, 
Emri varchar(20) not null, 
LastName varchar(20) not null, 
Phone varchar(20) not null,
JobTime integer not null,
Salary integer not null,
PRIMARY KEY (EmployeeID)
);

create table Reservation(
ReservationID integer not null,
RoomID integer not null,
ClientName varchar(20) not null,
Price integer not null,
Reservation_date datetime not null,
PRIMARY KEY (ReservationID),
FOREIGN KEY (RoomID) REFERENCES Room (RoomID) 
);


create table Room(
RoomID integer not null,
Room_nr integer not null,
Room_floor integer not null,
Room_category varchar(10) not null,
Room_Status bit not null,
PRIMARY KEY (RoomID)
);


create table Invoice (
InvoiceID integer not null,
ReservationID integer not null,
Amount integer not null,
Amount_paid bit not null,
Date datetime NOT NULL,
PRIMARY KEY (InvoiceID),
foreign key (ReservationID) references Reservation (ReservationID)
);






