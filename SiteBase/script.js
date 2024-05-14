document.addEventListener("DOMContentLoaded", function() {
  initializeMenu();
  initializeFlavors();
  loadMenu();
  loadFlavors();
  loadOrders();
});

function initializeMenu() {
  const initialMenu = [
      { name: "Pizza Margherita", price: 25.00 },
      { name: "Pizza Calabresa", price: 28.00 },
      { name: "Pizza Quatro Queijos", price: 30.00 }
  ];
  localStorage.setItem('menu', JSON.stringify(initialMenu));
}

function initializeFlavors() {
  const initialFlavors = [
      "Mussarela",
      "Pepperoni",
      "Frango com Catupiry",
      "Palmito",
      "Atum"
  ];
  localStorage.setItem('flavors', JSON.stringify(initialFlavors));
}


function showAddItemForm() {
  document.getElementById('add-item-form').classList.toggle('hidden');
}

function addItem() {
  const itemName = document.getElementById('item-name').value;
  const itemPrice = document.getElementById('item-price').value;

  if (!itemName || !itemPrice) {
      alert('Por favor, preencha todos os campos.');
      return;
  }

  const menu = JSON.parse(localStorage.getItem('menu')) || [];
  menu.push({ name: itemName, price: parseFloat(itemPrice) });
  localStorage.setItem('menu', JSON.stringify(menu));

  document.getElementById('item-name').value = '';
  document.getElementById('item-price').value = '';
  document.getElementById('add-item-form').classList.add('hidden');

  loadMenu();
}

function loadMenu() {
  const menu = JSON.parse(localStorage.getItem('menu')) || [];
  const menuContainer = document.getElementById('menu');
  const orderItems = document.getElementById('order-items');
  menuContainer.innerHTML = '';
  orderItems.innerHTML = '';

  menu.forEach((item, index) => {
      const itemDiv = document.createElement('div');
      itemDiv.textContent = `${item.name} - R$${item.price.toFixed(2)}`;
      menuContainer.appendChild(itemDiv);

      const option = document.createElement('option');
      option.value = index;
      option.textContent = item.name;
      orderItems.appendChild(option);
  });
}

function placeOrder() {
  const orderItems = document.getElementById('order-items');
  const selectedItemIndex = orderItems.value;
  const size = document.getElementById('size').value;
  const crust = document.getElementById('crust').value;
  const toppings = document.getElementById('toppings').value;

  const menu = JSON.parse(localStorage.getItem('menu')) || [];

  if (selectedItemIndex === '') {
      alert('Por favor, selecione um item do cardápio.');
      return;
  }

  const selectedItem = menu[selectedItemIndex];
  const orders = JSON.parse(localStorage.getItem('orders')) || [];
  orders.push({ item: selectedItem.name, price: selectedItem.price, size, crust, toppings, status: 'Recebido' });
  localStorage.setItem('orders', JSON.stringify(orders));

  loadOrders();
}

function loadOrders() {
  const orders = JSON.parse(localStorage.getItem('orders')) || [];
  const ordersContainer = document.getElementById('orders');
  ordersContainer.innerHTML = '';

  orders.forEach((order, index) => {
      const orderDiv = document.createElement('div');
      orderDiv.textContent = `${order.item} - R$${order.price.toFixed(2)} - ${order.size} - ${order.crust} - Adicionais: ${order.toppings} - ${order.status}`;
      ordersContainer.appendChild(orderDiv);
  });
}
