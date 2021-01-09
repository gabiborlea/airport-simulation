create database AirportSimulation
go
use AirportSimulation
go

create table Flights(
ID int primary key identity,
arrivalCity varchar(50),
boardingTime datetime,
arivalTime datetime)

create table CheckInPoints(
ID int primary key identity,
flightID int foreign key references Flights(ID),
startInterval datetime,
endInterval datetime)

create table Tickets(
ID int primary key identity,
flightID int foreign key references Flights(ID),
checkInPointID int foreign key references CheckInPoints(ID))

create table Passengers(
ID int primary key identity,
ticketID int foreign key references Tickets(ID) unique,
luggageChecked int default 0)

create table FlightsPassengers(
flightID int foreign key references Flights(ID),
passengerID int foreign key references Passengers(ID),
constraint pk_FlightsPassengers primary key (flightID, passengerID))

create table Luggages(
ID int primary key identity,
weight int,
passengerID int foreign key references Passengers(ID))

--drop table Luggages
--drop table FlightsPassengers
--drop table Passengers
--drop table Tickets
--drop table CheckInPoints
--drop table Flights

insert into Flights values
('Milano', '04-20-2021 10:20', '04-20-2021 11:00'),
('Budapest', '04-20-2021 10:40', '04-20-2021 11:10'),
('New-York', '04-20-2021 11:00', '04-20-2021 16:10'),
('Bucharest', '04-20-2021 11:40', '04-20-2021 12:00'),
('Munich', '04-20-2021 12:20', '04-20-2021 13:00'),
('Paris', '04-20-2021 12:30', '04-20-2021 13:30'),
('London', '04-20-2021 13:15', '04-20-2021 14:20'),
('Miami', '04-20-2021 13:15', '04-20-2021 20:00'),
('Barcelona', '04-20-2021 15:20', '04-20-2021 16:00'),
('Roma', '04-20-2021 23:50', '05-20-2021 00:20')

--delete from Flights

select * from Flights

insert into CheckInPoints values
(2, '04-20-2021 10:10', '04-20-2021 10:30'),
(1, '04-20-2021 09:50', '04-20-2021 10:10'),
(3, '04-20-2021 09:00', '04-20-2021 10:50'),
(4, '04-20-2021 11:00', '04-20-2021 11:30'),
(5, '04-20-2021 11:40', '04-20-2021 12:10'),
(6, '04-20-2021 11:40', '04-20-2021 12:20'),
(7, '04-20-2021 11:40', '04-20-2021 12:20'),
(8, '04-20-2021 12:20', '04-20-2021 13:00'),
(9, '04-20-2021 14:30', '04-20-2021 15:00'),
(10, '04-20-2021 23:10', '04-20-2021 23:35')

--delete from CheckInPoints

select * from CheckInPoints

insert into Tickets values 
(1,2),
(2,1),
(3,3),
(4,4),
(5,5)

--delete from Tickets

select * from Tickets

insert into Passengers values
(4, 0),
(5, 0),
(6, 0),
(7, 0),
(8, 0)

--delete from Passengers

select * from Passengers

insert into FlightsPassengers values
(1,2),
(2,3),
(3,4),
(4,5)

select * from FlightsPassengers