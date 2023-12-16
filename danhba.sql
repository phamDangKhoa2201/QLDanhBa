create database QLDanhBa
go
use QLDanhBa
go
create table NguoiDung
(
	MaND INT IDENTITY(1,1),
	SDTND char(12),
	MatKhau char(20),
	Ho nvarchar(20),
	Ten nvarchar(15),
	NgaySinh char(15),
	constraint pk_NguoiDung primary key (MaND),
	
)
alter table NguoiDung
add constraint uni_SDT Unique (SDTND)

create table DanhBa
(
	MaDB INT IDENTITY(1,1),
	SDTDB char(12),
	HoDB nvarchar(20),
	TenDB nvarchar(15),
	ChucVu nvarchar(30),
	NgaySinhDB char(15),
	MaND INT ,
	constraint pk_DanhBa primary key(MaDB),
	constraint fk_db_nd foreign key (MaND) references NguoiDung(MaND)
)
alter table DanhBa
add constraint uni_SDTDB Unique (SDTDB)

go


Insert into NguoiDung(SDTND, MatKhau ,Ho ,Ten ,NgaySinh) values ('0365152150','123123',N'Phạm', N'Khoa', '02/02/2001')
Insert into NguoiDung(SDTND, MatKhau ,Ho ,Ten ,NgaySinh) values ('0345667789','123123',N'Nguyễn', N'Kiều', '12/11/2002')
Insert into NguoiDung(SDTND, MatKhau ,Ho ,Ten ,NgaySinh) values ('0345667788','123123',N'Nguyễn', N'Hoà', '12/11/2002')
	select HoDB,TenDB,SDTDB,ChucVu,NgaySinhDB from NguoiDung nd, DanhBa db where nd.MaND=db.MaND and nd.SDTND = '0345667789' 

select * from NguoiDung where MatKhau ='123123' and SDTND = '0365152150'

select * from DanhBa where SDTDB='0765135876'
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0123123123', N'Hoàng', N'Mai', N'Bạn', '12/4/2003',1)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0323217892', N'Vũ', N'Thương', N'Sếp', '13/11/2002',1)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0937817613', N'Nguyễn', N'Long', N'Bạn', '3/2/2001',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0371388392', N'Đoàn', N'Tùng', N'Bạn', '1/4/2001',1)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0903748627', N'Hoàng', N'Tâm', N'Sếp', '18/7/2002',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0907658763', N'Đỗ', N'Quân', N'Ba', '10/1/2003',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0765135876', N'Lê', N'Trinh', N'Bạn', '2/8/2002',1)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0907658762', N'Đỗ', N'Quân', N'Ba', '10/1/2003',3)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0765135873', N'Lê', N'Trinh', N'Bạn', '2/8/2002',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0907628762', N'Đỗ', N'Quân', N'Ba', '10/1/2003',3)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0765125873', N'Lê', N'Trinh', N'Bạn', '2/8/2002',3)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0907658531', N'Huỳnh', N'Quốc', N'Bạn', '28/3/2001',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0934558763', N'Phạm', N'Đặng', N'Anh', '10/9/2003',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0974658763', N'Nguyễn', N'Nhân', N'Anh', '21/9/2001',2)
Insert into DanhBa(SDTDB,HoDB,TenDB,ChucVu,NgaySinhDB,MaND) values ('0993658763', N'Đỗ', N'Mai', N'Ba', '9/1/2002',2)

select * from NguoiDung nd, DanhBa db 
where nd.MaND=db.MaND and nd.SDTND = '0365152150' and db.ChucVu
delete DanhBa where MaDB = ''
select * from NguoiDung nd, DanhBa db where nd.MaND=db.MaND and nd.SDTND = '0365152150'