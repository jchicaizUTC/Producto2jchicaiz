# --- First database schema

# --- !Ups

create table comidas (
  id                        bigint not null,
  name                      varchar(255),
  costo                     varchar(255),
  bebida                    varchar(255),
  stock                     varchar(255),
   
  constraint pk_comidas primary key (id))
;


create sequence comidas_seq start with 1000;



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists comidas;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists comidas_seq;