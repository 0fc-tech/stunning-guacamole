package com.eniecole.enishop.repository

import com.eniecole.enishop.bo.Product

object RepositoryProducts {
    private val _products = listOf(
        Product(1L,"Smartphone Pro Max", "https://picsum.photos/seed/smartphonepromax/500/800", 1099.99f,"Smartphone"),
        Product(2L,"Smartphone Lite", "https://picsum.photos/seed/smartphone-lite/500/800", 499.99f,"Smartphone"),
        Product(3L,"Gaming Laptop 15\"", "https://picsum.photos/seed/gaming-laptop-15inch/500/800", 1499.99f,"Laptop"),
        Product(4L,"Ultrabook Thin 13\"", "https://picsum.photos/seed/ultrabook-thin-13inch/500/800", 999.99f,"Laptop"),
        Product(5L,"Tablet 10\" Plus", "https://picsum.photos/seed/tablet-10plus/500/800", 599.99f,"Tablet"),
        Product(6L,"Tablet 8\" Mini", "https://picsum.photos/seed/tablet-8mini/500/800", 399.99f,"Tablet"),
        Product(7L,"E-Reader Touch", "https://picsum.photos/seed/e-reader-touch/500/800", 129.99f,"Tablet"),
        Product(8L,"Smartwatch 4", "https://picsum.photos/seed/smartwatch-4/500/800", 249.99f,"Watch"),
        Product(9L,"Gaming Headset", "https://picsum.photos/seed/gaming-headset/500/800", 79.99f,"Headphones"),
        Product(10L,"Wireless Mouse", "https://picsum.photos/seed/wireless-mouse/500/800", 49.99f,"Mouse"),
        Product(11L,"Wireless Keyboard", "https://picsum.photos/seed/wireless-keyboard/500/800", 59.99f,"Keyboard"),
        Product(12L,"USB-C Hub", "https://picsum.photos/seed/usb-c-hub/500/800", 39.99f,"Accessories"),
        Product(13L,"Portable SSD 1TB", "https://picsum.photos/seed/portable-ssd-1tb/500/800", 109.99f,"Accessories"),
        Product(14L,"Monitor 24\" LED", "https://picsum.photos/seed/monitor-24inch-led/500/800", 199.99f,"Monitor"),
        Product(15L,"Graphics Tablet", "https://picsum.photos/seed/graphics-tablet/500/800", 299.99f,"Tablet"),
        Product(16L,"External GPU", "https://picsum.photos/seed/external-gpu/500/800", 599.99f,"GPU"),
        Product(17L,"Smartphone Stand", "https://picsum.photos/seed/smartphone-stand/500/800", 19.99f,"Accesories"),
        Product(18L,"Laptop Cooling Pad", "https://picsum.photos/seed/laptop-cooling-pad/500/800", 29.99f,"Laptop"),
        Product(19L,"Noise Cancelling Headphones", "https://picsum.photos/seed/noise-cancelling-headphones/500/800", 349.99f,"Headphones"),
        Product(20L,"Bluetooth Speaker", "https://picsum.photos/seed/bluetooth-speaker/500/800", 99.99f,"Speaker"),
        Product(21L,"Smart Home Hub", "https://picsum.photos/seed/smart-home-hub/500/800", 89.99f,"Smartphone"),
        Product(22L,"Wireless Charger", "https://picsum.photos/seed/wireless-charger/500/800", 29.99f,"Charger"),
        Product(23L,"VR Headset", "https://picsum.photos/seed/vr-headset/500/800", 399.99f,"VR"),
        Product(24L,"Action Camera", "https://picsum.photos/seed/action-camera/500/800", 199.99f,"Camera"),
        Product(25L,"Digital Pen", "https://picsum.photos/seed/digital-pen/500/800", 99.99f,"Pen"),
        Product(26L,"Gaming Mouse Pad", "https://picsum.photos/seed/gaming-mouse-pad/500/800", 19.99f,"Mouse"),
        Product(27L,"Docking Station", "https://picsum.photos/seed/docking-station/500/800", 99.99f,"Accesories"),
        Product(28L,"Fitness Tracker", "https://picsum.photos/seed/fitness-tracker/500/800", 149.99f,"Watch"),
        Product(29L,"Projector 4K", "https://picsum.photos/seed/projector-4k/500/800", 899.99f,"Projector"),
        Product(30L,"Webcam HD", "https://picsum.photos/seed/webcam-hd/500/800", 69.99f,"Webcam"),
        Product(31L,"Smart Light Bulb", "https://picsum.photos/seed/smart-light-bulb/500/800", 14.99f,"Accesories"),
        Product(32L,"Wireless Earbuds", "https://picsum.photos/seed/wireless-earbuds/500/800", 129.99f,"Headphones"),
        Product(33L,"Streaming Mic", "https://picsum.photos/seed/streaming-mic/500/800", 99.99f,"Microphone"),
        Product(34L,"Dual Monitor Stand", "https://picsum.photos/seed/dual-monitor-stand/500/800", 59.99f,"Monitor")
    )

    /**
     * @param id : identifiant du produit rechercher
     * @return Product? : le produit si trouvé sinon null
     */
    fun findById(id: Long):Product? = _products.find { it.id == id }

    fun getAll() : List<Product> = _products
}