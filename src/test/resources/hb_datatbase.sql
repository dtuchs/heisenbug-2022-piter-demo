create database hb_database
    with owner postgres;

create table users
(
    id      serial
        constraint users_pk
            primary key,
    name    varchar,
    balance integer
);

alter table users
    owner to postgres;

create unique index users_id_uindex
    on users (id);

create table purchase
(
    id      serial
        constraint purchase_pk
            primary key,
    user_id integer
        constraint purchase_users_id_fk
            references users,
    title   varchar,
    price   integer
);

alter table purchase
    owner to postgres;

create unique index purchase_id_uindex
    on purchase (id);
