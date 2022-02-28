DROP table IF EXISTS suministra;
DROP table IF EXISTS proveedores;
DROP table IF EXISTS piezas;

create TABLE proveedores(
	Id char(4),
	Nombre nvarchar(100),
	PRIMARY KEY (id)
);

create table piezas(
	Id int auto_increment,
	Nombre nvarchar(100),
	PRIMARY KEY (id)
);

create table suministra(
	Id int auto_increment,
	CodigoPieza int,
	IdProveedor char(4),
	PRIMARY KEY (id),
    KEY CodigoPieza_idx (CodigoPieza),
    CONSTRAINT CodigoPieza_idx FOREIGN KEY (CodigoPieza) REFERENCES piezas (Id),
    KEY IdProveedor_idx (IdProveedor),
    CONSTRAINT IdProveedor_idx FOREIGN KEY (IdProveedor) REFERENCES proveedores (Id)
);

