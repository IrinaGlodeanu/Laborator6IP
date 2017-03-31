/**
 * Created by pc on 3/31/2017.
 */
public abstract class Entity<TEntity> {
    public int id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity<TEntity> entity = (Entity<TEntity>) o;

        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return id;
    }


}

