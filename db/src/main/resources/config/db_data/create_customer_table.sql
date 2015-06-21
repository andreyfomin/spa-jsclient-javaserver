-- DELETE FROM CUSTOMER;
--
-- BEGIN
--   FOR i IN 1..10 LOOP  -- i starts at 10, ends at 1
--     INSERT INTO CUSTOMER (EMAIL, FIRSTNAME, LASTNAME)
--       VALUES ('andrey.fomin1@mail.ru', 'Andrey1', 'Fomin1'); -- statements here execute 10 times
--   END LOOP;
-- END;
--
-- COMMIT;


@LOOP 10 INSERT INTO CUSTOMER (EMAIL, FIRSTNAME, LASTNAME) VALUES ('andrey.fomin1@mail.ru', 'Andrey1', 'Fomin1');