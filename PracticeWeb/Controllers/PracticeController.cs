using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using PracticeWeb.Models;
using Microsoft.EntityFrameworkCore;

namespace PracticeWeb.Controllers
{
    [Route("api")]
    [ApiController]
    public class PracticeController : ControllerBase
    {
        private readonly PracticeContext _context;
        public PracticeController(PracticeContext context) => _context = context;

        //Gett:   api
        [HttpGet]
        public ActionResult<IEnumerable<Practice>> GetPractice()
        {
            return _context.PracticeItems;
        }
        
        //Get: api/id
        [Route("{id}")]
        [HttpGet("id")]
        public ActionResult<Practice> GetPracticeItem(int id)
        {
            var practiceItem = _context.PracticeItems.Find(id);
            if (practiceItem == null)
            {
                return NotFound();
            }
            return practiceItem;
        }

        //Post: api
        [HttpPost]
        public ActionResult<Practice> PostPracticeItem(Practice item)
        {
            _context.PracticeItems.Add(item);
            _context.SaveChanges();
            return CreatedAtAction("GetPracticeItem",new Practice{Id = item.Id}, item);
        }

        //Put:  api
        [HttpPut("{id}")]
        public ActionResult PutPracticeItem(int id, Practice item)
        {
            if(id != item.Id)
            {
                return BadRequest();
            }
            _context.Entry(item).State = EntityState.Modified;
            _context.SaveChanges();
            return NoContent();
        }
        //Delete api/
        [HttpDelete("{id}")]
        public ActionResult<Practice> DeletePracticeItem(int id)
        {
            var practiceItem = _context.PracticeItems.Find(id);
            if(practiceItem == null)
            {
                return NotFound();
            }

            _context.PracticeItems.Remove(practiceItem);
            _context.SaveChanges();
            return practiceItem;
        }
    }
}