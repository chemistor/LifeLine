# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table user (
  user_id                       uuid not null,
  email                         varchar(256) not null,
  roles                         varchar(255),
  constraint uq_user_email unique (email),
  constraint pk_user primary key (user_id)
);


# --- !Downs

drop table if exists user;

