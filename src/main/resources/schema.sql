drop table if exists member CASCADE;
create table member
(
    id bigint generated by default as identity,
    userid varchar(255) not null,
    pw varchar(255) not null,
    roles varchar(255) not null,
    primary key (id),
    unique (userid)
);