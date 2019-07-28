create table bots ( id varchar(100)
                  , name varchar(100)


);
alter table bots ADD CONSTRAINT pk_id PRIMARY KEY (id);

create table messages ( id varchar(100)
                      , conversation_Id varchar(100)
                      , timestamp       varchar(100)
                      , from_Id         varchar(100)
                      , to_Id           varchar(100)
                      , text            varchar(1000)


);

alter table messages ADD CONSTRAINT pk_id PRIMARY KEY (id, conversation_Id);
