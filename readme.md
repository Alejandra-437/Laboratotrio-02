### 🚀 Ejecutar PostgreSQL en Docker

```bash
docker run --name postgres-labos \
  -e POSTGRES_DB=mi_base \
  -e POSTGRES_USER=usuario \
  -e POSTGRES_PASSWORD=contra \
  -p 5432:5432 \
  -d postgres:15
```