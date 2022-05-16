drop table if exists sample;
create table sample
(
    id     serial primary key comment 'ID',
    sub_id bigint comment 'SUB ID',
    name   varchar(100) comment '名称'
) comment 'サンプル'