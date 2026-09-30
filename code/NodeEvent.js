const EventEmitter = require('events'); // Import the core module
const myEmitter = new EventEmitter();   // Create an instance

// 1. Register a listener (Subscriber)
myEmitter.on('event', (data) => {
    console.log(`Event `,data);
});
myEmitter.on('event', (data) => {
    console.log(`Event2 `,data);
});
// 2. Trigger the event (Publisher)
myEmitter.emit('event', 'Alice'); 