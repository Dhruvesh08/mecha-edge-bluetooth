
extern crate pretty_env_logger;
#[macro_use] extern crate log;

use std::error::Error;
use std::time::Duration;
use tokio::time;

use btleplug::api::{Central, Manager as _, Peripheral, ScanFilter};
use btleplug::platform::Manager;

#[tokio::main]
async fn main() -> Result<(), Box<dyn Error>> {
    pretty_env_logger::init();
    info!("Bluetooth information");


    let manager = Manager::new().await?;

    let adapter_list = manager.adapters().await?;
    info!("adapter_list: {:?}", adapter_list);
    //scan bluetooth devices
    for adapter in adapter_list.iter() {
        info!("scanning adapter: {:?}", adapter);
        adapter.start_scan(ScanFilter::default()).await?;
        time::sleep(Duration::from_secs(2)).await;
        // adapter.stop_scan().await?;
        let devices = adapter.peripherals().await?;
        let peripherals = adapter.peripherals().await?;
        for peripheral in peripherals {
            println!("Found peripheral: {:?}", peripheral.properties().await?);
        }
    }

    Ok(())
}
