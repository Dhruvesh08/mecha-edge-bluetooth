use std::error::Error;
use btleplug::api::{Central, Manager as _, Peripheral, ScanFilter};

use btleplug::platform::Manager;



#[tokio::main]
async fn main() -> Result<(), Box<dyn Error>> {
    pretty_env_logger::init();

    let manager = Manager::new().await.unwrap();

    // get the first bluetooth adapter
    println!("getting first adapter");
    let adapters = manager.adapters().await?;

    println!("turning on adapters");
    let _central = adapters.into_iter().nth(0).unwrap();

    Ok(())

}