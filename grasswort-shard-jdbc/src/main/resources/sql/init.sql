CREATE TABLE `book` (
 `id` BIGINT NOT NULL,
 `name` VARCHAR(45) NULL,
 `gmt_create` DATETIME NULL,
 `gmt_modified` DATETIME NULL,
 PRIMARY KEY (`id`),
 UNIQUE INDEX `id_UNIQUE` (`id` ASC));