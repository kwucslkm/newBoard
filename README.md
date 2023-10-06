## table

```sql
drop table board_table;
create table board_table
(
    id            bigint primary key auto_increment,
    boardWriter   varchar(50),
    boardPass     varchar(20),
    boardTitle    varchar(50),
    boardContents varchar(500),
    createdAt     datetime default now(),
    boardHits     int      default 0,
    fileAttached  int      default 0
);

drop table board_file_table;
create table board_file_table
(
    id               bigint primary key auto_increment,
    originalFileName varchar(100),
    storedFileName   varchar(100),
    boardId          bigint,
    constraint foreign key (boardId) references board_table (id) on delete cascade
);

drop table comment_table;
create table comment_table
(
    id              bigint primary key auto_increment,
    commentWriter   varchar(20),
    commentContents varchar(200),
    createdAt       datetime default now(),
    boardId         bigint,
    constraint foreign key (boardId) references board_table (id) on delete cascade
);
```