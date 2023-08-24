CREATE VIEW UsersView AS SELECT id, fullName(first_name, last_name) from users;
