using Microsoft.EntityFrameworkCore;

namespace PracticeWeb.Models{
    public class PracticeContext : DbContext
    {
        public PracticeContext(DbContextOptions<PracticeContext> options) : base (options)
        {

        }
        public DbSet<Practice> PracticeItems{get; set;}
        

    }
}