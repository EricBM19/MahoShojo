# mahoShojo-boot master doc

## Classes

### MahoShojo 1.0

```jav

```

### DarkArt 1.0

```java
@Entity
public class DarkArt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;

    @Enumerated(EnumType.STRING)
    private DarkArtType type;
}
```
