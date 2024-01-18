create table product (
    id bigint not null,
    name character varying(255),
    price bigint,
    image character varying(255),
    summary character varying(255),
    constraint product_pkey primary key
)