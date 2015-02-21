# spa-db


* spring-data-jpa       1.5.3.RELEASE
* spring-data-mongodb   1.4.1.RELEASE
* spring-data-commons   1.7.3.RELEASE


# Junit tips

Spring runs a test that is annotated with **@Transactional**, then by default it will rollback 
the transaction when the test completes. Check this of many similar issues. 
In order to override that default behavior, you need to use **@Rollback(false)**.

```java
    @Test
    @Rollback(false)
    public void testSaveCustomer() throws Exception {
        Customer result = customerRepository.save(customer);
        Assert.assertThat(result.getId(), is(notNullValue()));
    }
```


## README format

Markdown is a markup language with plain text formatting syntax designed so that it can be converted
to HTML and many other formats using a tool by the same name.

[markdown](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)


