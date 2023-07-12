document.addEventListener('DOMContentLoaded', function() {
    var menuItems = document.getElementById('menuItems');
    var hamburger = document.querySelector('.hamburger');
  
    hamburger.addEventListener('click', function() {
      menuItems.classList.toggle('show');
    });
  });
  