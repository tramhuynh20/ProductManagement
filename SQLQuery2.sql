USE [master]
GO
/****** Object:  Database [ProductManagement]    Script Date: 3/16/2021 2:22:09 PM ******/
CREATE DATABASE [ProductManagement]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ProductManagement', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\ProductManagement.mdf' , SIZE = 4096KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ProductManagement_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\ProductManagement_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ProductManagement] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ProductManagement].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ProductManagement] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ProductManagement] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ProductManagement] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ProductManagement] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ProductManagement] SET ARITHABORT OFF 
GO
ALTER DATABASE [ProductManagement] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [ProductManagement] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ProductManagement] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ProductManagement] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ProductManagement] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ProductManagement] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ProductManagement] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ProductManagement] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ProductManagement] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ProductManagement] SET  DISABLE_BROKER 
GO
ALTER DATABASE [ProductManagement] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ProductManagement] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ProductManagement] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ProductManagement] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ProductManagement] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ProductManagement] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ProductManagement] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ProductManagement] SET RECOVERY FULL 
GO
ALTER DATABASE [ProductManagement] SET  MULTI_USER 
GO
ALTER DATABASE [ProductManagement] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ProductManagement] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ProductManagement] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ProductManagement] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [ProductManagement] SET DELAYED_DURABILITY = DISABLED 
GO
EXEC sys.sp_db_vardecimal_storage_format N'ProductManagement', N'ON'
GO
USE [ProductManagement]
GO
/****** Object:  Table [dbo].[TblCategories]    Script Date: 3/16/2021 2:22:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TblCategories](
	[categoryID] [varchar](10) NOT NULL,
	[categoryName] [nvarchar](50) NOT NULL,
	[description] [nvarchar](200) NOT NULL,
 CONSTRAINT [PK_TblCategories] PRIMARY KEY CLUSTERED 
(
	[categoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TblProducts]    Script Date: 3/16/2021 2:22:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TblProducts](
	[productID] [varchar](10) NOT NULL,
	[productName] [nvarchar](50) NOT NULL,
	[unit] [nvarchar](50) NOT NULL,
	[price] [float] NOT NULL,
	[quantity] [int] NOT NULL,
	[categoryID] [varchar](10) NOT NULL,
 CONSTRAINT [PK_TblProducts] PRIMARY KEY CLUSTERED 
(
	[productID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TblUsers]    Script Date: 3/16/2021 2:22:09 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TblUsers](
	[userID] [varchar](10) NOT NULL,
	[fullName] [nvarchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[status] [bit] NOT NULL,
 CONSTRAINT [PK_TblUsers] PRIMARY KEY CLUSTERED 
(
	[userID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[TblCategories] ([categoryID], [categoryName], [description]) VALUES (N'BN', N'bé na', N'xấu quắc')
GO
INSERT [dbo].[TblCategories] ([categoryID], [categoryName], [description]) VALUES (N'CN', N'Chanel', N'Chất son đa dạng')
GO
INSERT [dbo].[TblCategories] ([categoryID], [categoryName], [description]) VALUES (N'GC', N'Gucci', N'Chất son lì ,mịn, tệp màu môi')
GO
INSERT [dbo].[TblCategories] ([categoryID], [categoryName], [description]) VALUES (N'HM', N'Hermes', N'Thiết kế sang chảnh, chất son lì ấn tượng')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'CN1', N'191 Rouge Brulant', N'thỏi', 849000, 3, N'CN')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'CN2', N'Chanel 73 Imperial', N'thỏi', 849000, 28, N'CN')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'CN3', N'Chanel 57 Rouge Feu', N'thỏi', 849000, 6, N'CN')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'CN4', N'64 First Light', N'thỏi', 849000, 17, N'CN')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'GC1', N'Gucci 208', N'thỏi', 990000, 18, N'GC')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'GC2', N'Gucci 300 Iconic Red', N'thỏi', 1250000, 7, N'GC')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'GC3', N'Gucci 502 Eadie Scarlet Màu Đỏ Đậm', N'thỏi', 1050000, 9, N'GC')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'GC4', N'Gucci 302 Agatha Orange Màu Đỏ Cam', N'thỏi', 1050000, 6, N'GC')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'HM1', N'Hermes màu 85 Rouge H Đỏ Mận', N'thỏi', 2150000, 12, N'HM')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'HM2', N'Hermes màu 46 Rouge Exotique Đỏ Cam ', N'thỏi', 2150000, 5, N'HM')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'HM3', N'Hermes 75 Rouge Amazone Đỏ Cam', N'thỏi', 2150000, 1, N'HM')
GO
INSERT [dbo].[TblProducts] ([productID], [productName], [unit], [price], [quantity], [categoryID]) VALUES (N'HM4', N'Hermes 51 Corail Fou Hồng San Hô', N'thỏi', 2150000, 11, N'HM')
GO
INSERT [dbo].[TblUsers] ([userID], [fullName], [password], [status]) VALUES (N'1', N'Lê Quang Vinh', N'123', 0)
GO
INSERT [dbo].[TblUsers] ([userID], [fullName], [password], [status]) VALUES (N'2', N'Lại Văn Sâm', N'234', 0)
GO
INSERT [dbo].[TblUsers] ([userID], [fullName], [password], [status]) VALUES (N'3', N'Donald Trump', N'345', 0)
GO
INSERT [dbo].[TblUsers] ([userID], [fullName], [password], [status]) VALUES (N'4', N'Joe Biden', N'456', 0)
GO
INSERT [dbo].[TblUsers] ([userID], [fullName], [password], [status]) VALUES (N'5', N'Barack Obama', N'567', 0)
GO
ALTER TABLE [dbo].[TblProducts]  WITH CHECK ADD  CONSTRAINT [FK_TblProducts_TblCategories] FOREIGN KEY([categoryID])
REFERENCES [dbo].[TblCategories] ([categoryID])
GO
ALTER TABLE [dbo].[TblProducts] CHECK CONSTRAINT [FK_TblProducts_TblCategories]
GO
USE [master]
GO
ALTER DATABASE [ProductManagement] SET  READ_WRITE 
GO
